.class public final LC9/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF9/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC9/d;->d(ZLx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:Z

.field private b:LC9/A;

.field final synthetic c:LW8/N;

.field final synthetic d:LV/G1;


# direct methods
.method constructor <init>(ZLW8/N;LV/G1;)V
    .locals 0

    iput-object p2, p0, LC9/d$a;->c:LW8/N;

    iput-object p3, p0, LC9/d$a;->d:LV/G1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LC9/d$a;->a:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    iget-object v0, p0, LC9/d$a;->b:LC9/A;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LC9/A;->a()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 4

    .prologue
    iget-object v0, p0, LC9/d$a;->b:LC9/A;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LC9/A;->a()V

    :cond_0
    new-instance v0, LC9/A;

    iget-object v1, p0, LC9/d$a;->c:LW8/N;

    iget-object v2, p0, LC9/d$a;->d:LV/G1;

    invoke-static {v2}, LC9/d;->i(LV/G1;)Lx7/p;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, LC9/A;-><init>(LW8/N;ZLx7/p;)V

    iput-object v0, p0, LC9/d$a;->b:LC9/A;

    return-void
.end method

.method public c(F)V
    .locals 1

    .prologue
    iget-object v0, p0, LC9/d$a;->b:LC9/A;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LC9/A;->e(F)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    :cond_0
    return-void
.end method

.method public d()V
    .locals 4

    .prologue
    iget-object v0, p0, LC9/d$a;->b:LC9/A;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LC9/A;->d()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LC9/A;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, LC9/d$a;->b:LC9/A;

    :cond_0
    iget-object v0, p0, LC9/d$a;->b:LC9/A;

    if-nez v0, :cond_1

    new-instance v0, LC9/A;

    iget-object v1, p0, LC9/d$a;->c:LW8/N;

    iget-object v2, p0, LC9/d$a;->d:LV/G1;

    invoke-static {v2}, LC9/d;->i(LV/G1;)Lx7/p;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, LC9/A;-><init>(LW8/N;ZLx7/p;)V

    iput-object v0, p0, LC9/d$a;->b:LC9/A;

    :cond_1
    iget-object v0, p0, LC9/d$a;->b:LC9/A;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LC9/A;->b()Z

    :cond_2
    return-void
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, LC9/d$a;->a:Z

    return-void
.end method

.method public isEnabled()Z
    .locals 1

    iget-boolean v0, p0, LC9/d$a;->a:Z

    return v0
.end method
