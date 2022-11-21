package potato.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import potato.dao.DetailedDAO;
import potato.domain.DetailedAmenityDomain;
import potato.domain.DetailedDomain;
import potato.domain.DetailedFoodDomain;
import potato.domain.DetailedReportDomain;
import potato.domain.DetailedReviewDomain;
import potato.vo.DetailedBookmarkVO;
import potato.vo.DetailedLikeVO;
import potato.vo.DetailedReportVO;
import potato.vo.DetailedReviewVO;

@Component
public class DetailedService {

	@Autowired(required = false)
	private DetailedDAO dDAO;
	
	//<�ްԼ� ��â>
	//�ްԼ� ��â ���� �ҷ�����
	public DetailedDomain getRestDetailed(int restarea_idx) {
		DetailedDomain dd=null;
		dd=dDAO.selectRestDetailed(restarea_idx);
		return dd;
	}
	
	//�ްԼ� �ϸ�ũ total
	public int getBookmarkTotal(int restarea_idx) {
		int booktotal=0;
		booktotal=dDAO.selectBookmarkTotal(restarea_idx);
		return booktotal;
	}
	
	//�ްԼ� �ϸ�ũ ����
	public int getBookmarkChk(DetailedBookmarkVO dbVO) {
		int bookChk=0;
		bookChk=dDAO.selectBookmarkChk(dbVO);
		return bookChk;
	}
	
	//�ްԼ� �ϸ�ũ �߰� (�񵿱�)
	public String setBookmarkAdd(DetailedBookmarkVO dbVO) {
		String bookAdd=null;
		bookAdd=dDAO.insertBookmarkAdd(dbVO);
		return bookAdd;
	}
	
	//�ްԼ� �ϸ�ũ ���� (�񵿱�)
	public String setBookmarkDel(DetailedBookmarkVO dbVO) {
		String bookDel=null;
		bookDel=dDAO.deleteBookmarkDel(dbVO);
		return bookDel;
	}
	
	//�ްԼ� ���� total
	public int getRateTotal(int restarea_idx) {
		int startotal=0;
		startotal=dDAO.selectRateTotal(restarea_idx);
		return startotal;
	}
	
	//�ްԼ� ���� ����
	public List<DetailedFoodDomain> getFoodDatailed(int restarea_idx) {
		List<DetailedFoodDomain> dfd=null;
		dfd=dDAO.selectFoodDatailed(restarea_idx);
		return dfd;
	}
	
	//�ްԼ� ���ǽü�������
	public List<DetailedAmenityDomain> getAmenityImg(int restarea_idx) {
		List<DetailedAmenityDomain> dad=null;
		dad=dDAO.selectAmenityImg(restarea_idx);
		return dad;
	}
	
	//<�ްԼ� ����>
	//���� �ۼ�â �̵�
	public DetailedReviewDomain moveReviewWrite(int restarea_idx) {
		return null;
	}
	
	//���� ����â �̵�
	public DetailedReviewDomain moveReReviewWrite(DetailedReviewVO drVO) {
		return null;
	}
	
	//���� �� total
	public int getReviewTotal(int restarea_idx) {
		int reviewtotal=0;
		reviewtotal=dDAO.selectReviewTotal(restarea_idx);
		return reviewtotal;
	}
	
	//���� �� sum
	public int getReviewSum(int restarea_idx) {
		int reviewSum=0;
		reviewSum=dDAO.selectReviewSum(restarea_idx);
		return reviewSum;
	}
	
	//���� ��ȸ(�񵿱�)
	public String getReviewAll(DetailedReviewVO drVO) {
		List<DetailedReviewDomain> list=null;
		list=dDAO.selectReviewAll(drVO);
		JSONObject jsonObj=new JSONObject();
		JSONObject jo=null;
		JSONArray js=new JSONArray();

		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String date=null;
		
		for(DetailedReviewDomain dd: list) {
			jo=new JSONObject();
			jo.put("contents", dd.getContents());
			jo.put("foodimg", dd.getFoodimg());
			jo.put("id", dd.getId());
			jo.put("img", dd.getImg());
			jo.put("liked", dd.getLiked());
			jo.put("nick", dd.getNick());
			date=dateFormat.format(dd.getPost_date());
			jo.put("post_date", date);
			jo.put("rating", dd.getRating());
			jo.put("review_idx", dd.getReview_idx());
			jo.put("idclick", dd.getIdclick());
			js.add(jo);
		}//end for
		//System.out.println("js:   "+js+"find me");
		
		jsonObj.put("review", js);
		
		//System.out.println("jsonObj:   "+jsonObj.toJSONString()+"find me");
		
		
		return jsonObj.toJSONString();
	}
	
	//����¡ ó�� ���� 
	public int getStartPageNum() {
		return 0;
	}
	
	//����¡ ������ ������
	public int getLastPageNum(int total) {
		int lastPage = (int) Math.ceil((double) total / 1);
		return lastPage;
	}
	
	//����¡ �⺻ ������ ��������
	public int getPageScale() {
		return 0;
	}
	
	//Ÿ����� ������ �̵�
	public DetailedReviewDomain moveOtherProfile(String id) {
		return null;
	}
	
	//���� ���ƿ� total
	public int getLikeTotal(DetailedLikeVO dlVO) {
		return 0;
	}
	
	//���� ���ƿ� �߰�
	public String getLikeAdd(DetailedLikeVO dlVO) {
		String likeAdd=null;
		likeAdd=dDAO.insertLikeAdd(dlVO);
		return likeAdd;
	}
	
	//���� ���ƿ� ����
	public String getLikeDel(DetailedLikeVO dlVO) {
		String likeDel=null;
		likeDel=dDAO.deleteLikeDel(dlVO);
		return likeDel;
	}
	
	//���� ����
	public int getReviewDel(DetailedReviewVO drVO) {
		return 0;
	}
	
	//<�Ű�â>
	//�Ű�â ����
	public List<DetailedReportDomain> getReportPopup() {
		return null;
	}
	
	//�Ű� ����
	public int setReportPopup(DetailedReportVO drVO) {
		return 0;
	}
	
}
