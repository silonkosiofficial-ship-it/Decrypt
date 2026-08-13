.class public final Lk3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(Ls3/Q1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Ls3/Q1;->C:Z

    iput-boolean v0, p0, Lk3/x;->a:Z

    iget-boolean v0, p1, Ls3/Q1;->D:Z

    iput-boolean v0, p0, Lk3/x;->b:Z

    iget-boolean p1, p1, Ls3/Q1;->E:Z

    iput-boolean p1, p0, Lk3/x;->c:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lk3/x;->c:Z

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lk3/x;->b:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lk3/x;->a:Z

    return v0
.end method
