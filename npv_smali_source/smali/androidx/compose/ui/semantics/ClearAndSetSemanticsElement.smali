.class public final Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;
.super LF0/W;
.source "SourceFile"

# interfaces
.implements LK0/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LF0/W;",
        "LK0/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u098e"
    }
    d2 = {
        "\u098f",
        "\u0990",
        "\u0991",
        "\u0992",
        "\u0993",
        "\u0994",
        "\u0995",
        "\u0996",
        "\u0997",
        "\u0998",
        "\u0999",
        "\u099a",
        "\u099b",
        "\u099c",
        "\u099d",
        "",
        "\u099e",
        "\u099f",
        "",
        "\u09a0",
        "\u09a1",
        "",
        "\u09a2",
        "",
        "\u09a3",
        "\u09a4",
        "\u09a5",
        "\u09a6",
        "\u09a7",
        "\u09a8",
        "\u09a9",
        "\u09aa",
        "\u09ab",
        "\u09ac",
        "\u09ad"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final b:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, LF0/W;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->b:Lx7/l;

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
    instance-of v1, p1, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;

    iget-object v1, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->b:Lx7/l;

    iget-object p1, p1, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->b:Lx7/l;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public bridge synthetic g()Landroidx/compose/ui/d$c;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->l()LK0/c;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->b:Lx7/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()LK0/k;
    .locals 2

    new-instance v0, LK0/k;

    invoke-direct {v0}, LK0/k;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LK0/k;->P(Z)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LK0/k;->O(Z)V

    iget-object v1, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->b:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic j(Landroidx/compose/ui/d$c;)V
    .locals 0

    check-cast p1, LK0/c;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->m(LK0/c;)V

    return-void
.end method

.method public l()LK0/c;
    .locals 4

    new-instance v0, LK0/c;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->b:Lx7/l;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LK0/c;-><init>(ZZLx7/l;)V

    return-object v0
.end method

.method public m(LK0/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->b:Lx7/l;

    invoke-virtual {p1, v0}, LK0/c;->U1(Lx7/l;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ClearAndSetSemanticsElement(properties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->b:Lx7/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
