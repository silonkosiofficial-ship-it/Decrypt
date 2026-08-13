.class final Lcom/google/android/gms/internal/measurement/e1$b;
.super Lcom/google/android/gms/internal/measurement/Y0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final C:Li4/t;


# direct methods
.method constructor <init>(Li4/t;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/Y0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/e1$b;->C:Li4/t;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$b;->C:Li4/t;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final d4(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$b;->C:Li4/t;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Li4/t;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method
