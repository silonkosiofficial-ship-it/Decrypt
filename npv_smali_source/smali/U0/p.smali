.class final LU0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/G1;


# instance fields
.field private final C:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LU0/p;->C:Z

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/Boolean;
    .locals 1

    iget-boolean v0, p0, LU0/p;->C:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LU0/p;->e()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
