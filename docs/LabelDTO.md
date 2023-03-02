# LabelDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the component. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**label** | **String** | The text that appears in the label. |  [optional]
**width** | **Double** | The width of the label in pixels when at a 1:1 scale. |  [optional]
**height** | **Double** | The height of the label in pixels when at a 1:1 scale. |  [optional]
**getzIndex** | **Long** | The z index of the label. |  [optional]
**style** | **Map&lt;String, String&gt;** | The styles for this label (font-size : 12px, background-color : #eee, etc). |  [optional]
