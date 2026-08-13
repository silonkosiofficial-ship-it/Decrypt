.class final synthetic Landroidx/compose/ui/focus/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/l;
.implements Ly7/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/focus/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field private final synthetic C:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/l$a;->C:Lx7/l;

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroidx/compose/ui/focus/j;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l$a;->C:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b()Li7/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/l$a;->C:Lx7/l;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lm0/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Ly7/n;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/focus/l$a;->b()Li7/i;

    move-result-object v0

    check-cast p1, Ly7/n;

    invoke-interface {p1}, Ly7/n;->b()Li7/i;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/focus/l$a;->b()Li7/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
