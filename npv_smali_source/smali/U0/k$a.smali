.class public final LU0/k$a;
.super Landroidx/emoji2/text/f$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU0/k;->c()LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LV/w0;

.field final synthetic b:LU0/k;


# direct methods
.method constructor <init>(LV/w0;LU0/k;)V
    .locals 0

    iput-object p1, p0, LU0/k$a;->a:LV/w0;

    iput-object p2, p0, LU0/k$a;->b:LU0/k;

    invoke-direct {p0}, Landroidx/emoji2/text/f$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LU0/k$a;->b:LU0/k;

    invoke-static {}, LU0/o;->a()LU0/p;

    move-result-object v0

    invoke-static {p1, v0}, LU0/k;->b(LU0/k;LV/G1;)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, LU0/k$a;->a:LV/w0;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LV/w0;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, LU0/k$a;->b:LU0/k;

    new-instance v1, LU0/p;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LU0/p;-><init>(Z)V

    invoke-static {v0, v1}, LU0/k;->b(LU0/k;LV/G1;)V

    return-void
.end method
