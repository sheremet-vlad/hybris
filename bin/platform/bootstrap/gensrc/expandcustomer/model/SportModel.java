/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20.05.2019 9:30:27                          ---
 * ----------------------------------------------------------------
 */
package expandcustomer.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import expandcustomer.enums.SportTypeEnum;
import expandcustomer.model.SportProductModel;
import java.util.List;

/**
 * Generated model class for type Sport first defined at extension expandcustomer.
 */
@SuppressWarnings("all")
public class SportModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "Sport";
	
	/**<i>Generated relation code constant for relation <code>SportToSportProduct</code> defining source attribute <code>sportProduct</code> in extension <code>expandcustomer</code>.</i>*/
	public static final String _SPORTTOSPORTPRODUCT = "SportToSportProduct";
	
	/** <i>Generated constant</i> - Attribute key of <code>Sport.sportType</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String SPORTTYPE = "sportType";
	
	/** <i>Generated constant</i> - Attribute key of <code>Sport.sportProduct</code> attribute defined at extension <code>expandcustomer</code>. */
	public static final String SPORTPRODUCT = "sportProduct";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SportModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SportModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _sportProduct initial attribute declared by type <code>Sport</code> at extension <code>expandcustomer</code>
	 */
	@Deprecated
	public SportModel(final List<SportProductModel> _sportProduct)
	{
		super();
		setSportProduct(_sportProduct);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _sportProduct initial attribute declared by type <code>Sport</code> at extension <code>expandcustomer</code>
	 */
	@Deprecated
	public SportModel(final ItemModel _owner, final List<SportProductModel> _sportProduct)
	{
		super();
		setOwner(_owner);
		setSportProduct(_sportProduct);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportProduct</code> attribute defined at extension <code>expandcustomer</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the sportProduct
	 */
	@Accessor(qualifier = "sportProduct", type = Accessor.Type.GETTER)
	public List<SportProductModel> getSportProduct()
	{
		return getPersistenceContext().getPropertyValue(SPORTPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportType</code> attribute defined at extension <code>expandcustomer</code>. 
	 * @return the sportType
	 */
	@Accessor(qualifier = "sportType", type = Accessor.Type.GETTER)
	public SportTypeEnum getSportType()
	{
		return getPersistenceContext().getPropertyValue(SPORTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Sport.sportProduct</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the sportProduct
	 */
	@Accessor(qualifier = "sportProduct", type = Accessor.Type.SETTER)
	public void setSportProduct(final List<SportProductModel> value)
	{
		getPersistenceContext().setPropertyValue(SPORTPRODUCT, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Sport.sportType</code> attribute defined at extension <code>expandcustomer</code>. 
	 *  
	 * @param value the sportType
	 */
	@Accessor(qualifier = "sportType", type = Accessor.Type.SETTER)
	public void setSportType(final SportTypeEnum value)
	{
		getPersistenceContext().setPropertyValue(SPORTTYPE, value);
	}
	
}
