.class public final LT/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/S;


# instance fields
.field private final b:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LA/S;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LT/v;->b:LV/w0;

    return-void
.end method


# virtual methods
.method public a(LY0/e;LY0/v;)I
    .locals 1

    invoke-virtual {p0}, LT/v;->e()LA/S;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LA/S;->a(LY0/e;LY0/v;)I

    move-result p1

    return p1
.end method

.method public b(LY0/e;)I
    .locals 1

    invoke-virtual {p0}, LT/v;->e()LA/S;

    move-result-object v0

    invoke-interface {v0, p1}, LA/S;->b(LY0/e;)I

    move-result p1

    return p1
.end method

.method public c(LY0/e;)I
    .locals 1

    invoke-virtual {p0}, LT/v;->e()LA/S;

    move-result-object v0

    invoke-interface {v0, p1}, LA/S;->c(LY0/e;)I

    move-result p1

    return p1
.end method

.method public d(LY0/e;LY0/v;)I
    .locals 1

    invoke-virtual {p0}, LT/v;->e()LA/S;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LA/S;->d(LY0/e;LY0/v;)I

    move-result p1

    return p1
.end method

.method public final e()LA/S;
    .locals 1

    iget-object v0, p0, LT/v;->b:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/S;

    return-object v0
.end method

.method public final f(LA/S;)V
    .locals 1

    iget-object v0, p0, LT/v;->b:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
