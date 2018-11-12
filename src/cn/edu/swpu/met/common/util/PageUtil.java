package cn.edu.swpu.met.common.util;

public class PageUtil {

	// 当前是第几页
	private int currentPage;
	// 每页显示多少条数据
	private int pageSize;
	// 一共有多少条数据
	private int totalCount;
	// 一共有多少页
	private int totalPage;

	public int getCurrentPage() {
		return currentPage;
	}

	// 合理控制页码
	public void setCurrentPage(int currentPage) {
		// 当前页码大于0才分页
		if (currentPage > 0) {
			this.currentPage = currentPage;
		}

	}

	public int getPageSize() {
		return pageSize;
	}

	// 合理控制每页显示的数量
	public void setPageSize(int pageSize) {

		if (pageSize > 0) {
			this.pageSize = pageSize;
		}

	}

	public int getTotalCount() {
		return totalCount;
	}

	// 总记录
	public void setTotalCount(int totalCount) {
		if (totalCount > 0) {
			this.totalCount = totalCount;
			this.calcTotalCount();// 调用计算页数的方法
		}

	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * 根据总记录分页50 /50
	 * 
	 * @Title: calcTotalCount
	 * @Description: TODO
	 * @date 2017-7-12 上午11:30:51
	 * @throws
	 */
	public void calcTotalCount() {
		// 能够除尽，整数页
		if (this.totalCount % pageSize == 0) {
			this.totalPage = this.totalCount / pageSize;
			// 不能整除，要加多1页
		} else if (this.totalCount % pageSize > 0) {
			this.totalPage = this.totalCount / pageSize + 1;
		} else {
			this.totalPage = 0;
		}

		/*this.totalPage = this.totalCount % pageSize == 0 ? this.totalCount
				/ pageSize : this.totalCount / pageSize + 1;*/
	}

}
