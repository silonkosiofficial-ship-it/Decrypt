.class final Lcom/google/android/gms/measurement/internal/U5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Ljava/lang/String;

.field private final synthetic D:Ljava/lang/String;

.field private final synthetic E:Landroid/os/Bundle;

.field private final synthetic F:Lcom/google/android/gms/measurement/internal/S5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/S5;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/U5;->C:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/U5;->D:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/U5;->E:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/U5;->F:Lcom/google/android/gms/measurement/internal/S5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/U5;->F:Lcom/google/android/gms/measurement/internal/S5;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/S5;->a:Lcom/google/android/gms/measurement/internal/H5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/H5;->y0()Lcom/google/android/gms/measurement/internal/d6;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/U5;->C:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/U5;->D:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/U5;->E:Landroid/os/Bundle;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/U5;->F:Lcom/google/android/gms/measurement/internal/S5;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/S5;->a:Lcom/google/android/gms/measurement/internal/H5;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/H5;->b()LV3/f;

    move-result-object v0

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v6

    const/4 v8, 0x0

    const/4 v9, 0x1

    const-string v5, "auto"

    invoke-virtual/range {v1 .. v9}, Lcom/google/android/gms/measurement/internal/d6;->H(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lcom/google/android/gms/measurement/internal/E;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/U5;->F:Lcom/google/android/gms/measurement/internal/S5;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/S5;->a:Lcom/google/android/gms/measurement/internal/H5;

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/measurement/internal/E;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/U5;->C:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/H5;->w(Lcom/google/android/gms/measurement/internal/E;Ljava/lang/String;)V

    return-void
.end method
