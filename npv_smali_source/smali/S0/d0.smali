.class public final LS0/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LS0/X;

.field private final b:LS0/P;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LS0/X;LS0/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS0/d0;->a:LS0/X;

    iput-object p2, p0, LS0/d0;->b:LS0/P;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LS0/d0;->a:LS0/X;

    invoke-virtual {v0, p0}, LS0/X;->g(LS0/d0;)V

    return-void
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, LS0/d0;->a:LS0/X;

    invoke-virtual {v0}, LS0/X;->a()LS0/d0;

    move-result-object v0

    invoke-static {v0, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c(Ln0/i;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LS0/d0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LS0/d0;->b:LS0/P;

    invoke-interface {v1, p1}, LS0/P;->f(Ln0/i;)V

    :cond_0
    return v0
.end method

.method public final d(LS0/V;LS0/V;)Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LS0/d0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LS0/d0;->b:LS0/P;

    invoke-interface {v1, p1, p2}, LS0/P;->b(LS0/V;LS0/V;)V

    :cond_0
    return v0
.end method

.method public final e(LS0/V;LS0/L;LM0/K;Lx7/l;Ln0/i;Ln0/i;)Z
    .locals 8

    .prologue
    invoke-virtual {p0}, LS0/d0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LS0/d0;->b:LS0/P;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, LS0/P;->d(LS0/V;LS0/L;LM0/K;Lx7/l;Ln0/i;Ln0/i;)V

    :cond_0
    return v0
.end method
