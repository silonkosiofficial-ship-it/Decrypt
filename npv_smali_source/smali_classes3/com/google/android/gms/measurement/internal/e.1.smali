.class public final Lcom/google/android/gms/measurement/internal/e;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public C:Ljava/lang/String;

.field public D:Ljava/lang/String;

.field public E:Lcom/google/android/gms/measurement/internal/Y5;

.field public F:J

.field public G:Z

.field public H:Ljava/lang/String;

.field public I:Lcom/google/android/gms/measurement/internal/E;

.field public J:J

.field public K:Lcom/google/android/gms/measurement/internal/E;

.field public L:J

.field public M:Lcom/google/android/gms/measurement/internal/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/d;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/measurement/internal/e;)V
    .locals 2

    invoke-direct {p0}, LR3/a;-><init>()V

    invoke-static {p1}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/e;->C:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->C:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/e;->D:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->D:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/e;->E:Lcom/google/android/gms/measurement/internal/Y5;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->E:Lcom/google/android/gms/measurement/internal/Y5;

    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/e;->F:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/e;->F:J

    iget-boolean v0, p1, Lcom/google/android/gms/measurement/internal/e;->G:Z

    iput-boolean v0, p0, Lcom/google/android/gms/measurement/internal/e;->G:Z

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/e;->H:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->H:Ljava/lang/String;

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/e;->I:Lcom/google/android/gms/measurement/internal/E;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->I:Lcom/google/android/gms/measurement/internal/E;

    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/e;->J:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/e;->J:J

    iget-object v0, p1, Lcom/google/android/gms/measurement/internal/e;->K:Lcom/google/android/gms/measurement/internal/E;

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/e;->K:Lcom/google/android/gms/measurement/internal/E;

    iget-wide v0, p1, Lcom/google/android/gms/measurement/internal/e;->L:J

    iput-wide v0, p0, Lcom/google/android/gms/measurement/internal/e;->L:J

    iget-object p1, p1, Lcom/google/android/gms/measurement/internal/e;->M:Lcom/google/android/gms/measurement/internal/E;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/e;->M:Lcom/google/android/gms/measurement/internal/E;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/Y5;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/E;JLcom/google/android/gms/measurement/internal/E;JLcom/google/android/gms/measurement/internal/E;)V
    .locals 0

    invoke-direct {p0}, LR3/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/e;->C:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/e;->D:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/e;->E:Lcom/google/android/gms/measurement/internal/Y5;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/e;->F:J

    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/e;->G:Z

    iput-object p7, p0, Lcom/google/android/gms/measurement/internal/e;->H:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/measurement/internal/e;->I:Lcom/google/android/gms/measurement/internal/E;

    iput-wide p9, p0, Lcom/google/android/gms/measurement/internal/e;->J:J

    iput-object p11, p0, Lcom/google/android/gms/measurement/internal/e;->K:Lcom/google/android/gms/measurement/internal/E;

    iput-wide p12, p0, Lcom/google/android/gms/measurement/internal/e;->L:J

    iput-object p14, p0, Lcom/google/android/gms/measurement/internal/e;->M:Lcom/google/android/gms/measurement/internal/E;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/e;->C:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e;->D:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e;->E:Lcom/google/android/gms/measurement/internal/Y5;

    invoke-static {p1, v1, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/e;->F:J

    invoke-static {p1, v1, v4, v5}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/4 v1, 0x6

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/e;->G:Z

    invoke-static {p1, v1, v2}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e;->H:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e;->I:Lcom/google/android/gms/measurement/internal/E;

    invoke-static {p1, v1, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0x9

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/e;->J:J

    invoke-static {p1, v1, v4, v5}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e;->K:Lcom/google/android/gms/measurement/internal/E;

    invoke-static {p1, v1, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/16 v1, 0xb

    iget-wide v4, p0, Lcom/google/android/gms/measurement/internal/e;->L:J

    invoke-static {p1, v1, v4, v5}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v1, 0xc

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e;->M:Lcom/google/android/gms/measurement/internal/E;

    invoke-static {p1, v1, v2, p2, v3}, LR3/c;->p(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
