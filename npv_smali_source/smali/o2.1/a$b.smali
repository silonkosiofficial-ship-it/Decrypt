.class public final Lo2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "b"
.end annotation


# instance fields
.field private final a:Ly2/c;

.field final synthetic b:Lo2/a;


# direct methods
.method public constructor <init>(Lo2/a;Ly2/c;)V
    .locals 1

    const-string v0, "actual"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo2/a$b;->b:Lo2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lo2/a$b;->a:Ly2/c;

    return-void
.end method

.method public static final synthetic b(Lo2/a$b;)Ly2/c;
    .locals 0

    iget-object p0, p0, Lo2/a$b;->a:Ly2/c;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ly2/b;
    .locals 3

    .prologue
    const-string v0, "fileName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lp2/b;

    iget-object v1, p0, Lo2/a$b;->b:Lo2/a;

    invoke-static {v1}, Lo2/a;->c(Lo2/a;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lo2/a$b;->b:Lo2/a;

    invoke-static {v1}, Lo2/a;->d(Lo2/a;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ":memory:"

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p1, v1}, Lp2/b;-><init>(Ljava/lang/String;Z)V

    new-instance v1, Lo2/a$b$a;

    iget-object v2, p0, Lo2/a$b;->b:Lo2/a;

    invoke-direct {v1, v2, p0, p1}, Lo2/a$b$a;-><init>(Lo2/a;Lo2/a$b;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lp2/b;->b(Lx7/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/b;

    return-object p1
.end method
