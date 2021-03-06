package ru.innopolis.innoweather.presentation.di.components;


import dagger.Component;
import ru.innopolis.innoweather.presentation.di.PerActivity;
import ru.innopolis.innoweather.presentation.di.modules.ActivityModule;
import ru.innopolis.innoweather.presentation.di.modules.CityModule;
import ru.innopolis.innoweather.presentation.view.fragment.AddNewCityDialogFragment;
import ru.innopolis.innoweather.presentation.view.fragment.CitiesListFragment;
import ru.innopolis.innoweather.presentation.view.fragment.WeatherDetailsFragment;

/**
 * A scope {@link PerActivity} component.
 * Injects user specific Fragments.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, CityModule.class})
public interface CityComponent extends ActivityComponent {
    void inject(WeatherDetailsFragment weatherDetailsFragment);
    void inject(CitiesListFragment citiesListFragment);
    void inject(AddNewCityDialogFragment addNewCityDialogFragment);
}
