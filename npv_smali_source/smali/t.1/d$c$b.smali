.class final Lt/d$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/d$c;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LV/M0;

.field final synthetic D:Lu/s0;

.field final synthetic E:LV/G1;


# direct methods
.method constructor <init>(LV/M0;Lu/s0;LV/G1;)V
    .locals 0

    iput-object p1, p0, Lt/d$c$b;->C:LV/M0;

    iput-object p2, p0, Lt/d$c$b;->D:Lu/s0;

    iput-object p3, p0, Lt/d$c$b;->E:LV/G1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lt/d$c$b;->b(ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(ZLm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object p2, p0, Lt/d$c$b;->C:LV/M0;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt/d$c$b;->E:LV/G1;

    invoke-static {p1}, Lt/d;->h(LV/G1;)Lx7/p;

    move-result-object p1

    iget-object v0, p0, Lt/d$c$b;->D:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lt/d$c$b;->D:Lu/s0;

    invoke-virtual {v1}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
