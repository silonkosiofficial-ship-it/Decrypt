.class final Landroidx/compose/ui/focus/FocusRequesterElement;
.super LF0/W;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u07bc"
    }
    d2 = {
        "\u07bd",
        "\u07be",
        "\u07bf",
        "\u07c0",
        "\u07c1",
        "\u07c2",
        "\u07c3",
        "\u07c4",
        "\u07c5",
        "\u07c6",
        "\u07c7",
        "\u07c8",
        "\u07c9",
        "",
        "\u07ca",
        "\u07cb",
        "",
        "\u07cc",
        "\u07cd",
        "",
        "\u07ce",
        "",
        "\u07cf",
        "\u07d0",
        "\u07d1",
        "\u07d2",
        "\u07d3",
        "\u07d4",
        "\u07d5"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Landroidx/compose/ui/focus/n;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/n;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Landroidx/compose/ui/focus/n;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/focus/FocusRequesterElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/focus/FocusRequesterElement;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Landroidx/compose/ui/focus/n;

    iget-object p1, p1, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Landroidx/compose/ui/focus/n;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusRequesterElement;->l()Landroidx/compose/ui/focus/q;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, Landroidx/compose/ui/focus/q;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/focus/FocusRequesterElement;->m(Landroidx/compose/ui/focus/q;)V

    return-void
.end method

.method public l()Landroidx/compose/ui/focus/q;
    .locals 2

    new-instance v0, Landroidx/compose/ui/focus/q;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Landroidx/compose/ui/focus/n;

    invoke-direct {v0, v1}, Landroidx/compose/ui/focus/q;-><init>(Landroidx/compose/ui/focus/n;)V

    return-object v0
.end method

.method public m(Landroidx/compose/ui/focus/q;)V
    .locals 1

    invoke-virtual {p1}, Landroidx/compose/ui/focus/q;->T1()Landroidx/compose/ui/focus/n;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n;->e()LX/b;

    move-result-object v0

    invoke-virtual {v0, p1}, LX/b;->A(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Landroidx/compose/ui/focus/n;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/focus/q;->U1(Landroidx/compose/ui/focus/n;)V

    invoke-virtual {p1}, Landroidx/compose/ui/focus/q;->T1()Landroidx/compose/ui/focus/n;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n;->e()LX/b;

    move-result-object v0

    invoke-virtual {v0, p1}, LX/b;->d(Ljava/lang/Object;)Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FocusRequesterElement(focusRequester="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusRequesterElement;->b:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
