package ua.nure.kolodiazhny.SummaryTask04_2.service;

import java.util.List;

import ua.nure.kolodiazhny.SummaryTask04_2.web.model.entity.CatalogBean;

/**
 * Used for sorting products on page.
 *
 * @author Nikolay Kolodiazhny
 * @version 1.0
 *
 */
public interface SortService {

	/**
	 * Sorts by name (Z-->A).
	 *
	 * @param things
	 *            products for sorting
	 * @return sorted list
	 */
	public List<CatalogBean> sortByNameZA(List<CatalogBean> things);

	/**
	 * Sorts by name (A-->Z).
	 *
	 * @param things
	 *            products for sorting
	 * @return sorted list
	 */
	public List<CatalogBean> sortByNameAZ(List<CatalogBean> things);

	/**
	 * Sorts by price (A-->Z).
	 *
	 * @param things
	 *            products for sorting
	 * @return sorted list
	 */
	public List<CatalogBean> sortByPriceAZ(List<CatalogBean> things);

	/**
	 * Sorts by price (Z-->A).
	 *
	 * @param things
	 *            products for sorting
	 * @return sorted list
	 */
	public List<CatalogBean> sortByPriceZA(List<CatalogBean> things);

	/**
	 * Sorts by interval.
	 *
	 * @param things
	 *            products for sorting
	 * @return sorted list
	 */
	public List<CatalogBean> sortByPriceInterval(List<CatalogBean> things, String from, String to);

	/**
	 * Sorts by novelty.
	 *
	 * @param things
	 *            products for sorting
	 * @return sorted list
	 */
	public List<CatalogBean> sortByNovelty(List<CatalogBean> things);
}