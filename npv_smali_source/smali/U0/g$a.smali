.class final LU0/g$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU0/g;->e(Lo0/n0;JF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo0/n0;

.field final synthetic E:J


# direct methods
.method constructor <init>(Lo0/n0;J)V
    .locals 0

    iput-object p1, p0, LU0/g$a;->D:Lo0/n0;

    iput-wide p2, p0, LU0/g$a;->E:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Shader;
    .locals 3

    iget-object v0, p0, LU0/g$a;->D:Lo0/n0;

    check-cast v0, Lo0/a2;

    iget-wide v1, p0, LU0/g$a;->E:J

    invoke-virtual {v0, v1, v2}, Lo0/a2;->b(J)Landroid/graphics/Shader;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LU0/g$a;->a()Landroid/graphics/Shader;

    move-result-object v0

    return-object v0
.end method
