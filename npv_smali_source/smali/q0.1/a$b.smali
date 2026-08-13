.class public final Lq0/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq0/a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lq0/j;

.field private b:Lr0/c;

.field final synthetic c:Lq0/a;


# direct methods
.method constructor <init>(Lq0/a;)V
    .locals 0

    iput-object p1, p0, Lq0/a$b;->c:Lq0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lq0/b;->a(Lq0/d;)Lq0/j;

    move-result-object p1

    iput-object p1, p0, Lq0/a$b;->a:Lq0/j;

    return-void
.end method


# virtual methods
.method public a(LY0/e;)V
    .locals 1

    iget-object v0, p0, Lq0/a$b;->c:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq0/a$a;->j(LY0/e;)V

    return-void
.end method

.method public b(LY0/v;)V
    .locals 1

    iget-object v0, p0, Lq0/a$b;->c:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq0/a$a;->k(LY0/v;)V

    return-void
.end method

.method public c()Lq0/j;
    .locals 1

    iget-object v0, p0, Lq0/a$b;->a:Lq0/j;

    return-object v0
.end method

.method public d(J)V
    .locals 1

    iget-object v0, p0, Lq0/a$b;->c:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lq0/a$a;->l(J)V

    return-void
.end method

.method public e(Lr0/c;)V
    .locals 0

    iput-object p1, p0, Lq0/a$b;->b:Lr0/c;

    return-void
.end method

.method public f()Lr0/c;
    .locals 1

    iget-object v0, p0, Lq0/a$b;->b:Lr0/c;

    return-object v0
.end method

.method public g(Lo0/q0;)V
    .locals 1

    iget-object v0, p0, Lq0/a$b;->c:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lq0/a$a;->i(Lo0/q0;)V

    return-void
.end method

.method public getDensity()LY0/e;
    .locals 1

    iget-object v0, p0, Lq0/a$b;->c:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lq0/a$a;->f()LY0/e;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, Lq0/a$b;->c:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lq0/a$a;->g()LY0/v;

    move-result-object v0

    return-object v0
.end method

.method public h()Lo0/q0;
    .locals 1

    iget-object v0, p0, Lq0/a$b;->c:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lq0/a$a;->e()Lo0/q0;

    move-result-object v0

    return-object v0
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Lq0/a$b;->c:Lq0/a;

    invoke-virtual {v0}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lq0/a$a;->h()J

    move-result-wide v0

    return-wide v0
.end method
