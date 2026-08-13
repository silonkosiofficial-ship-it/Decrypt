.class public final LF0/C0;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"


# instance fields
.field private P:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/d$c;->J1(I)V

    return-void
.end method


# virtual methods
.method public D1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LF0/C0;->P:Z

    return-void
.end method

.method public E1()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LF0/C0;->P:Z

    return-void
.end method

.method public final T1()Z
    .locals 1

    iget-boolean v0, p0, LF0/C0;->P:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "<tail>"

    return-object v0
.end method
