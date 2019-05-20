/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20.05.2019 9:30:27                          ---
 * ----------------------------------------------------------------
 */
package expandcustomer.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import expandcustomer.constants.ExpandcustomerConstants;
import expandcustomer.jalo.SportProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Sport.
 */
@SLDSafe
@SuppressWarnings({"unused","cast","PMD"})
public class Sport extends GenericItem
{
	/** Qualifier of the <code>Sport.sportType</code> attribute **/
	public static final String SPORTTYPE = "sportType";
	/** Qualifier of the <code>Sport.sportProduct</code> attribute **/
	public static final String SPORTPRODUCT = "sportProduct";
	/**
	* {@link OneToManyHandler} for handling 1:n SPORTPRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SportProduct> SPORTPRODUCTHANDLER = new OneToManyHandler<SportProduct>(
	ExpandcustomerConstants.TC.SPORTPRODUCT,
	false,
	"sport",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SPORTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportProduct</code> attribute.
	 * @return the sportProduct
	 */
	public List<SportProduct> getSportProduct(final SessionContext ctx)
	{
		return (List<SportProduct>)SPORTPRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportProduct</code> attribute.
	 * @return the sportProduct
	 */
	public List<SportProduct> getSportProduct()
	{
		return getSportProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.sportProduct</code> attribute. 
	 * @param value the sportProduct
	 */
	public void setSportProduct(final SessionContext ctx, final List<SportProduct> value)
	{
		SPORTPRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.sportProduct</code> attribute. 
	 * @param value the sportProduct
	 */
	public void setSportProduct(final List<SportProduct> value)
	{
		setSportProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sportProduct. 
	 * @param value the item to add to sportProduct
	 */
	public void addToSportProduct(final SessionContext ctx, final SportProduct value)
	{
		SPORTPRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sportProduct. 
	 * @param value the item to add to sportProduct
	 */
	public void addToSportProduct(final SportProduct value)
	{
		addToSportProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sportProduct. 
	 * @param value the item to remove from sportProduct
	 */
	public void removeFromSportProduct(final SessionContext ctx, final SportProduct value)
	{
		SPORTPRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sportProduct. 
	 * @param value the item to remove from sportProduct
	 */
	public void removeFromSportProduct(final SportProduct value)
	{
		removeFromSportProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportType</code> attribute.
	 * @return the sportType
	 */
	public EnumerationValue getSportType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "sportType".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Sport.sportType</code> attribute.
	 * @return the sportType
	 */
	public EnumerationValue getSportType()
	{
		return getSportType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.sportType</code> attribute. 
	 * @param value the sportType
	 */
	public void setSportType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "sportType".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Sport.sportType</code> attribute. 
	 * @param value the sportType
	 */
	public void setSportType(final EnumerationValue value)
	{
		setSportType( getSession().getSessionContext(), value );
	}
	
}
