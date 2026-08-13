.class final LV/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/Z0;


# instance fields
.field private final C:Lx7/l;

.field private D:LV/M;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/L;->C:Lx7/l;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    iget-object v0, p0, LV/L;->D:LV/M;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LV/M;->e()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LV/L;->D:LV/M;

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LV/L;->C:Lx7/l;

    invoke-static {}, LV/Q;->g()LV/N;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/M;

    iput-object v0, p0, LV/L;->D:LV/M;

    return-void
.end method
