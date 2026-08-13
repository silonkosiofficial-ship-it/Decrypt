.class final LP1/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP1/c;->d(Landroid/content/Context;LF7/k;)LM1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroid/content/Context;

.field final synthetic E:LP1/c;


# direct methods
.method constructor <init>(Landroid/content/Context;LP1/c;)V
    .locals 0

    iput-object p1, p0, LP1/c$a;->D:Landroid/content/Context;

    iput-object p2, p0, LP1/c$a;->E:LP1/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 2

    iget-object v0, p0, LP1/c$a;->D:Landroid/content/Context;

    const-string v1, "applicationContext"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LP1/c$a;->E:LP1/c;

    invoke-static {v1}, LP1/c;->c(LP1/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LP1/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP1/c$a;->a()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
