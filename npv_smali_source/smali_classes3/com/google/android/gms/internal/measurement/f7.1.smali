.class public final Lcom/google/android/gms/internal/measurement/f7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM4/k;


# static fields
.field private static D:Lcom/google/android/gms/internal/measurement/f7;


# instance fields
.field private final C:LM4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/f7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/f7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/f7;->D:Lcom/google/android/gms/internal/measurement/f7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/h7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/h7;-><init>()V

    invoke-static {v0}, LM4/l;->b(Ljava/lang/Object;)LM4/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->C:LM4/k;

    return-void
.end method

.method public static a()D
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->D:Lcom/google/android/gms/internal/measurement/f7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/e7;->a()D

    move-result-wide v0

    return-wide v0
.end method

.method public static b()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->D:Lcom/google/android/gms/internal/measurement/f7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/e7;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->D:Lcom/google/android/gms/internal/measurement/f7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/e7;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->D:Lcom/google/android/gms/internal/measurement/f7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/e7;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->D:Lcom/google/android/gms/internal/measurement/f7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/e7;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/f7;->D:Lcom/google/android/gms/internal/measurement/f7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/f7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/e7;->e()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f7;->C:LM4/k;

    invoke-interface {v0}, LM4/k;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    return-object v0
.end method
