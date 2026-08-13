.class final Lo2/w$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/w;-><init>(Lo2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo2/w;


# direct methods
.method constructor <init>(Lo2/w;)V
    .locals 0

    iput-object p1, p0, Lo2/w$a;->D:Lo2/w;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lz2/h;
    .locals 1

    iget-object v0, p0, Lo2/w$a;->D:Lo2/w;

    invoke-static {v0}, Lo2/w;->a(Lo2/w;)Lz2/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lo2/w$a;->a()Lz2/h;

    move-result-object v0

    return-object v0
.end method
