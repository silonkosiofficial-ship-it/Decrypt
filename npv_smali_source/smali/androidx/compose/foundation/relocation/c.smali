.class abstract synthetic Landroidx/compose/foundation/relocation/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LE/b;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/relocation/a;

    invoke-direct {v0}, Landroidx/compose/foundation/relocation/a;-><init>()V

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/d;LE/b;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;-><init>(LE/b;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
