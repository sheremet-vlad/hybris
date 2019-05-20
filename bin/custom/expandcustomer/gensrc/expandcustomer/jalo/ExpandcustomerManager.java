/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20.05.2019 9:30:27                          ---
 * ----------------------------------------------------------------
 */
package expandcustomer.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import expandcustomer.constants.ExpandcustomerConstants;
import expandcustomer.jalo.Sport;
import expandcustomer.jalo.SportProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ExpandcustomerManager</code>.
 */
@SuppressWarnings({"unused","cast","PMD"})
@SLDSafe
public class ExpandcustomerManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sport", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Sport createSport(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Sport");
			return (Sport)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Sport : "+e.getMessage(), 0 );
		}
	}
	
	public Sport createSport(final Map attributeValues)
	{
		return createSport( getSession().getSessionContext(), attributeValues );
	}
	
	public SportProduct createSportProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("SportProduct");
			return (SportProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SportProduct : "+e.getMessage(), 0 );
		}
	}
	
	public SportProduct createSportProduct(final Map attributeValues)
	{
		return createSportProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public static final ExpandcustomerManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ExpandcustomerManager) em.getExtension(ExpandcustomerConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return ExpandcustomerConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sport</code> attribute.
	 * @return the sport
	 */
	public Sport getSport(final SessionContext ctx, final Customer item)
	{
		return (Sport)item.getProperty( ctx, ExpandcustomerConstants.Attributes.Customer.SPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.sport</code> attribute.
	 * @return the sport
	 */
	public Sport getSport(final Customer item)
	{
		return getSport( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sport</code> attribute. 
	 * @param value the sport
	 */
	public void setSport(final SessionContext ctx, final Customer item, final Sport value)
	{
		item.setProperty(ctx, ExpandcustomerConstants.Attributes.Customer.SPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.sport</code> attribute. 
	 * @param value the sport
	 */
	public void setSport(final Customer item, final Sport value)
	{
		setSport( getSession().getSessionContext(), item, value );
	}
	
}
