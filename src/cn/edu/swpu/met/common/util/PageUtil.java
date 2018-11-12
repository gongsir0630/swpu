package cn.edu.swpu.met.common.util;

public class PageUtil {

	// ��ǰ�ǵڼ�ҳ
	private int currentPage;
	// ÿҳ��ʾ����������
	private int pageSize;
	// һ���ж���������
	private int totalCount;
	// һ���ж���ҳ
	private int totalPage;

	public int getCurrentPage() {
		return currentPage;
	}

	// �������ҳ��
	public void setCurrentPage(int currentPage) {
		// ��ǰҳ�����0�ŷ�ҳ
		if (currentPage > 0) {
			this.currentPage = currentPage;
		}

	}

	public int getPageSize() {
		return pageSize;
	}

	// �������ÿҳ��ʾ������
	public void setPageSize(int pageSize) {

		if (pageSize > 0) {
			this.pageSize = pageSize;
		}

	}

	public int getTotalCount() {
		return totalCount;
	}

	// �ܼ�¼
	public void setTotalCount(int totalCount) {
		if (totalCount > 0) {
			this.totalCount = totalCount;
			this.calcTotalCount();// ���ü���ҳ���ķ���
		}

	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * �����ܼ�¼��ҳ50 /50
	 * 
	 * @Title: calcTotalCount
	 * @Description: TODO
	 * @date 2017-7-12 ����11:30:51
	 * @throws
	 */
	public void calcTotalCount() {
		// �ܹ�����������ҳ
		if (this.totalCount % pageSize == 0) {
			this.totalPage = this.totalCount / pageSize;
			// ����������Ҫ�Ӷ�1ҳ
		} else if (this.totalCount % pageSize > 0) {
			this.totalPage = this.totalCount / pageSize + 1;
		} else {
			this.totalPage = 0;
		}

		/*this.totalPage = this.totalCount % pageSize == 0 ? this.totalCount
				/ pageSize : this.totalCount / pageSize + 1;*/
	}

}
