package resolvers;

import org.ignacioScript.co.dao.*;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.sql.SQLException;

public class DaoParameterResolver implements ParameterResolver {
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        Class<?>  paramtype =  parameterContext.getParameter().getType();

        return  paramtype.equals(CustomerDAO.class) ||
                    paramtype.equals(AdminDAO.class) ||
                    paramtype.equals(ProductDAO.class) ||
                    paramtype.equals(ReportDAO.class) ||
                    paramtype.equals(SaleDAO.class) ||
                    paramtype.equals(SalesClerkDAO.class);


    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        Class<?> paramType = parameterContext.getParameter().getType();

        if (paramType.equals(CustomerDAO.class)){
            try {
                return new CustomerDAO();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } else if (paramType.equals(AdminDAO.class)){
            return new AdminDAO();
        } else if (paramType.equals(ReportDAO.class)){
            return new ReportDAO();
        } else if (paramType.equals(ProductDAO.class)){
            return new ProductDAO();
        } else if (paramType.equals(SaleDAO.class)){
            return new SaleDAO();
        } else if (paramType.equals(SalesClerkDAO.class)){
            return new SalesClerkDAO();
        }

        return null;
    }
}
