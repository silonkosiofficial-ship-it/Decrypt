.class public final Lcom/google/android/gms/internal/measurement/o6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM4/k;


# static fields
.field private static D:Lcom/google/android/gms/internal/measurement/o6;


# instance fields
.field private final C:LM4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/o6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/o6;->D:Lcom/google/android/gms/internal/measurement/o6;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/q6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/q6;-><init>()V

    invoke-static {v0}, LM4/l;->b(Ljava/lang/Object;)LM4/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/o6;->C:LM4/k;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o6;->D:Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/r6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/r6;->a()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/o6;->D:Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/r6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/r6;->b()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/o6;->C:LM4/k;

    invoke-interface {v0}, LM4/k;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/r6;

    return-object v0
.end method
