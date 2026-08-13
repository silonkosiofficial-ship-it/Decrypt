.class final LA/J$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/J;->h([LD0/X;LD0/M;I[III[IIII)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:[LD0/X;

.field final synthetic E:LA/J;

.field final synthetic F:I

.field final synthetic G:I

.field final synthetic H:[I


# direct methods
.method constructor <init>([LD0/X;LA/J;II[I)V
    .locals 0

    iput-object p1, p0, LA/J$a;->D:[LD0/X;

    iput-object p2, p0, LA/J$a;->E:LA/J;

    iput p3, p0, LA/J$a;->F:I

    iput p4, p0, LA/J$a;->G:I

    iput-object p5, p0, LA/J$a;->H:[I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LA/J$a;->D:[LD0/X;

    iget-object v2, v0, LA/J$a;->E:LA/J;

    iget v3, v0, LA/J$a;->F:I

    iget v4, v0, LA/J$a;->G:I

    iget-object v5, v0, LA/J$a;->H:[I

    array-length v6, v1

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v10, v1, v7

    add-int/lit8 v16, v8, 0x1

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v10}, LA/D;->d(LD0/X;)LA/H;

    move-result-object v9

    invoke-static {v2, v10, v9, v3, v4}, LA/J;->k(LA/J;LD0/X;LA/H;II)I

    move-result v12

    aget v11, v5, v8

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    move/from16 v8, v16

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LA/J$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
