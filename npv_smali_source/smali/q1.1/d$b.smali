.class Lq1/d$b;
.super Lq1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic g:Lq1/d;


# direct methods
.method public constructor <init>(Lq1/d;Lq1/c;)V
    .locals 0

    iput-object p1, p0, Lq1/d$b;->g:Lq1/d;

    invoke-direct {p0}, Lq1/b;-><init>()V

    new-instance p1, Lq1/j;

    invoke-direct {p1, p0, p2}, Lq1/j;-><init>(Lq1/b;Lq1/c;)V

    iput-object p1, p0, Lq1/b;->e:Lq1/b$a;

    return-void
.end method
