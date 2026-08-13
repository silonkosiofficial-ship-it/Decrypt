.class final LA/j$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/j;->h([LD0/X;LD0/M;I[III[IIII)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:[LD0/X;

.field final synthetic E:LA/j;

.field final synthetic F:I

.field final synthetic G:I

.field final synthetic H:LD0/M;

.field final synthetic I:[I


# direct methods
.method constructor <init>([LD0/X;LA/j;IILD0/M;[I)V
    .locals 0

    iput-object p1, p0, LA/j$a;->D:[LD0/X;

    iput-object p2, p0, LA/j$a;->E:LA/j;

    iput p3, p0, LA/j$a;->F:I

    iput p4, p0, LA/j$a;->G:I

    iput-object p5, p0, LA/j$a;->H:LD0/M;

    iput-object p6, p0, LA/j$a;->I:[I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 24

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LA/j$a;->D:[LD0/X;

    iget-object v8, v0, LA/j$a;->E:LA/j;

    iget v9, v0, LA/j$a;->F:I

    iget v10, v0, LA/j$a;->G:I

    iget-object v11, v0, LA/j$a;->H:LD0/M;

    iget-object v12, v0, LA/j$a;->I:[I

    array-length v13, v1

    const/4 v2, 0x0

    move v14, v2

    move v15, v14

    :goto_0
    if-ge v14, v13, :cond_0

    aget-object v17, v1, v14

    add-int/lit8 v23, v15, 0x1

    invoke-static/range {v17 .. v17}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static/range {v17 .. v17}, LA/D;->d(LD0/X;)LA/H;

    move-result-object v4

    invoke-interface {v11}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v7

    move-object v2, v8

    move-object/from16 v3, v17

    move v5, v9

    move v6, v10

    invoke-static/range {v2 .. v7}, LA/j;->k(LA/j;LD0/X;LA/H;IILY0/v;)I

    move-result v18

    aget v19, v12, v15

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, p1

    invoke-static/range {v16 .. v22}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    move/from16 v15, v23

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LA/j$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
