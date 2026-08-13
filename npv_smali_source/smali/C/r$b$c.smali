.class public final LC/r$b$c;
.super LC/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/r$b;->a(LD/w;J)LC/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Z

.field final synthetic h:LC/G;


# direct methods
.method constructor <init>(ZLC/G;IILC/r$b$b;LC/J;)V
    .locals 0

    iput-boolean p1, p0, LC/r$b$c;->g:Z

    iput-object p2, p0, LC/r$b$c;->h:LC/G;

    invoke-direct/range {p0 .. p6}, LC/y;-><init>(ZLC/G;IILC/w;LC/J;)V

    return-void
.end method


# virtual methods
.method public b(I[LC/v;Ljava/util/List;I)LC/x;
    .locals 8

    new-instance v7, LC/x;

    iget-object v3, p0, LC/r$b$c;->h:LC/G;

    iget-boolean v5, p0, LC/r$b$c;->g:Z

    move-object v0, v7

    move v1, p1

    move-object v2, p2

    move-object v4, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, LC/x;-><init>(I[LC/v;LC/G;Ljava/util/List;ZI)V

    return-object v7
.end method
