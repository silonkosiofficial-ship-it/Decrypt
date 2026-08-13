.class final Lo2/n$g;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/n;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo2/n;


# direct methods
.method constructor <init>(Lo2/n;)V
    .locals 0

    iput-object p1, p0, Lo2/n$g;->D:Lo2/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz2/d;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lo2/n$g;->D:Lo2/n;

    invoke-static {p1}, Lo2/n;->a(Lo2/n;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/d;

    invoke-virtual {p0, p1}, Lo2/n$g;->a(Lz2/d;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
