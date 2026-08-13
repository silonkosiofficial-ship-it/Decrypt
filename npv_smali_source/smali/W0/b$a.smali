.class final LW0/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW0/b;-><init>(Lo0/a2;F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LW0/b;


# direct methods
.method constructor <init>(LW0/b;)V
    .locals 0

    iput-object p1, p0, LW0/b$a;->D:LW0/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Shader;
    .locals 4

    .prologue
    iget-object v0, p0, LW0/b$a;->D:LW0/b;

    invoke-virtual {v0}, LW0/b;->b()J

    move-result-wide v0

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LW0/b$a;->D:LW0/b;

    invoke-virtual {v0}, LW0/b;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->k(J)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    iget-object v0, p0, LW0/b$a;->D:LW0/b;

    invoke-virtual {v0}, LW0/b;->a()Lo0/a2;

    move-result-object v0

    iget-object v1, p0, LW0/b$a;->D:LW0/b;

    invoke-virtual {v1}, LW0/b;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo0/a2;->b(J)Landroid/graphics/Shader;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW0/b$a;->a()Landroid/graphics/Shader;

    move-result-object v0

    return-object v0
.end method
