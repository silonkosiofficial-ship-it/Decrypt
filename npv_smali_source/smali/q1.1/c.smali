.class public Lq1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lq1/f;

.field b:Lq1/f;

.field c:Lq1/f;

.field d:[Lq1/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq1/g;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lq1/g;-><init>(I)V

    iput-object v0, p0, Lq1/c;->a:Lq1/f;

    new-instance v0, Lq1/g;

    invoke-direct {v0, v1}, Lq1/g;-><init>(I)V

    iput-object v0, p0, Lq1/c;->b:Lq1/f;

    new-instance v0, Lq1/g;

    invoke-direct {v0, v1}, Lq1/g;-><init>(I)V

    iput-object v0, p0, Lq1/c;->c:Lq1/f;

    const/16 v0, 0x20

    new-array v0, v0, [Lq1/i;

    iput-object v0, p0, Lq1/c;->d:[Lq1/i;

    return-void
.end method
