.class public final Lcom/google/android/gms/measurement/internal/M5;
.super LR3/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/measurement/internal/M5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final C:Ljava/lang/String;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:J

.field public final H:J

.field public final I:Ljava/lang/String;

.field public final J:Z

.field public final K:Z

.field public final L:J

.field public final M:Ljava/lang/String;

.field private final N:J

.field public final O:J

.field public final P:I

.field public final Q:Z

.field public final R:Z

.field public final S:Ljava/lang/String;

.field public final T:Ljava/lang/Boolean;

.field public final U:J

.field public final V:Ljava/util/List;

.field private final W:Ljava/lang/String;

.field public final X:Ljava/lang/String;

.field public final Y:Ljava/lang/String;

.field public final Z:Ljava/lang/String;

.field public final a0:Z

.field public final b0:J

.field public final c0:I

.field public final d0:Ljava/lang/String;

.field public final e0:I

.field public final f0:J

.field public final g0:Ljava/lang/String;

.field public final h0:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/e6;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/e6;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/M5;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .prologue
    move-object v0, p0

    invoke-direct {p0}, LR3/a;-><init>()V

    invoke-static {p1}, LQ3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->C:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->D:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->E:Ljava/lang/String;

    move-wide v3, p4

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/M5;->L:J

    move-object v1, p6

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->F:Ljava/lang/String;

    move-wide v3, p7

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/M5;->G:J

    move-wide v3, p9

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/M5;->H:J

    move-object/from16 v1, p11

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->I:Ljava/lang/String;

    move/from16 v1, p12

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->J:Z

    move/from16 v1, p13

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->K:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->M:Ljava/lang/String;

    move-wide/from16 v3, p15

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/M5;->N:J

    move-wide/from16 v3, p17

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/M5;->O:J

    move/from16 v1, p19

    iput v1, v0, Lcom/google/android/gms/measurement/internal/M5;->P:I

    move/from16 v1, p20

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->Q:Z

    move/from16 v1, p21

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->R:Z

    move-object/from16 v1, p22

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->S:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->T:Ljava/lang/Boolean;

    move-wide/from16 v3, p24

    iput-wide v3, v0, Lcom/google/android/gms/measurement/internal/M5;->U:J

    move-object/from16 v1, p26

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->V:Ljava/util/List;

    iput-object v2, v0, Lcom/google/android/gms/measurement/internal/M5;->W:Ljava/lang/String;

    move-object/from16 v1, p28

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->X:Ljava/lang/String;

    move-object/from16 v1, p29

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->Y:Ljava/lang/String;

    move-object/from16 v1, p30

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->Z:Ljava/lang/String;

    move/from16 v1, p31

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->a0:Z

    move-wide/from16 v1, p32

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->b0:J

    move/from16 v1, p34

    iput v1, v0, Lcom/google/android/gms/measurement/internal/M5;->c0:I

    move-object/from16 v1, p35

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->d0:Ljava/lang/String;

    move/from16 v1, p36

    iput v1, v0, Lcom/google/android/gms/measurement/internal/M5;->e0:I

    move-wide/from16 v1, p37

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->f0:J

    move-object/from16 v1, p39

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->g0:Ljava/lang/String;

    move-object/from16 v1, p40

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->h0:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;ZZJLjava/lang/String;JJIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, LR3/a;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->C:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->D:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->E:Ljava/lang/String;

    move-wide v1, p12

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->L:J

    move-object v1, p4

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->F:Ljava/lang/String;

    move-wide v1, p5

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->G:J

    move-wide v1, p7

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->H:J

    move-object v1, p9

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->I:Ljava/lang/String;

    move v1, p10

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->J:Z

    move v1, p11

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->K:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->M:Ljava/lang/String;

    move-wide/from16 v1, p15

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->N:J

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->O:J

    move/from16 v1, p19

    iput v1, v0, Lcom/google/android/gms/measurement/internal/M5;->P:I

    move/from16 v1, p20

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->Q:Z

    move/from16 v1, p21

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->R:Z

    move-object/from16 v1, p22

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->S:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->T:Ljava/lang/Boolean;

    move-wide/from16 v1, p24

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->U:J

    move-object/from16 v1, p26

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->V:Ljava/util/List;

    move-object/from16 v1, p27

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->W:Ljava/lang/String;

    move-object/from16 v1, p28

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->X:Ljava/lang/String;

    move-object/from16 v1, p29

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->Y:Ljava/lang/String;

    move-object/from16 v1, p30

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->Z:Ljava/lang/String;

    move/from16 v1, p31

    iput-boolean v1, v0, Lcom/google/android/gms/measurement/internal/M5;->a0:Z

    move-wide/from16 v1, p32

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->b0:J

    move/from16 v1, p34

    iput v1, v0, Lcom/google/android/gms/measurement/internal/M5;->c0:I

    move-object/from16 v1, p35

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->d0:Ljava/lang/String;

    move/from16 v1, p36

    iput v1, v0, Lcom/google/android/gms/measurement/internal/M5;->e0:I

    move-wide/from16 v1, p37

    iput-wide v1, v0, Lcom/google/android/gms/measurement/internal/M5;->f0:J

    move-object/from16 v1, p39

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->g0:Ljava/lang/String;

    move-object/from16 v1, p40

    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M5;->h0:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, LR3/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/M5;->C:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->D:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->E:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->F:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v0, 0x6

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/M5;->G:J

    invoke-static {p1, v0, v3, v4}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/4 v0, 0x7

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/M5;->H:J

    invoke-static {p1, v0, v3, v4}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->I:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x9

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/M5;->J:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/16 v0, 0xa

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/M5;->K:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/16 v0, 0xb

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/M5;->L:J

    invoke-static {p1, v0, v3, v4}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v0, 0xc

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->M:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0xd

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/M5;->N:J

    invoke-static {p1, v0, v3, v4}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v0, 0xe

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/M5;->O:J

    invoke-static {p1, v0, v3, v4}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v0, 0xf

    iget v1, p0, Lcom/google/android/gms/measurement/internal/M5;->P:I

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/16 v0, 0x10

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/M5;->Q:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/16 v0, 0x12

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/M5;->R:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/16 v0, 0x13

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->S:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x15

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->T:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1, v2}, LR3/c;->d(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    const/16 v0, 0x16

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/M5;->U:J

    invoke-static {p1, v0, v3, v4}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v0, 0x17

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->V:Ljava/util/List;

    invoke-static {p1, v0, v1, v2}, LR3/c;->s(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/16 v0, 0x18

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->W:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x19

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->X:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x1a

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->Y:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x1b

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->Z:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x1c

    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/M5;->a0:Z

    invoke-static {p1, v0, v1}, LR3/c;->c(Landroid/os/Parcel;IZ)V

    const/16 v0, 0x1d

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/M5;->b0:J

    invoke-static {p1, v0, v3, v4}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v0, 0x1e

    iget v1, p0, Lcom/google/android/gms/measurement/internal/M5;->c0:I

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/16 v0, 0x1f

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->d0:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x20

    iget v1, p0, Lcom/google/android/gms/measurement/internal/M5;->e0:I

    invoke-static {p1, v0, v1}, LR3/c;->k(Landroid/os/Parcel;II)V

    const/16 v0, 0x22

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/M5;->f0:J

    invoke-static {p1, v0, v3, v4}, LR3/c;->n(Landroid/os/Parcel;IJ)V

    const/16 v0, 0x23

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->g0:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/16 v0, 0x24

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/M5;->h0:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, LR3/c;->q(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, LR3/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
