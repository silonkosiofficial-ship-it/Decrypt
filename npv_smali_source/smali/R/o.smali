.class public abstract LR/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv/H;


# instance fields
.field private final C:Z

.field private final D:LR/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLV/G1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LR/o;->C:Z

    new-instance v0, LR/u;

    new-instance v1, LR/o$a;

    invoke-direct {v1, p2}, LR/o$a;-><init>(LV/G1;)V

    invoke-direct {v0, p1, v1}, LR/u;-><init>(ZLx7/a;)V

    iput-object v0, p0, LR/o;->D:LR/u;

    return-void
.end method


# virtual methods
.method public abstract e(Lz/n$b;LW8/N;)V
.end method

.method public final f(Lq0/g;FJ)V
    .locals 3

    .prologue
    iget-object v0, p0, LR/o;->D:LR/u;

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean p2, p0, LR/o;->C:Z

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v1

    invoke-static {p1, p2, v1, v2}, LR/i;->a(LY0/e;ZJ)F

    move-result p2

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, LY0/e;->B0(F)F

    move-result p2

    :goto_0
    invoke-virtual {v0, p1, p2, p3, p4}, LR/u;->b(Lq0/g;FJ)V

    return-void
.end method

.method public abstract g(Lz/n$b;)V
.end method

.method public final h(Lz/i;LW8/N;)V
    .locals 1

    iget-object v0, p0, LR/o;->D:LR/u;

    invoke-virtual {v0, p1, p2}, LR/u;->c(Lz/i;LW8/N;)V

    return-void
.end method
