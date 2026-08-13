.class public abstract Lu/X;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private final c:Lr/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x12c

    iput v0, p0, Lu/X;->a:I

    invoke-static {}, Lr/o;->b()Lr/C;

    move-result-object v0

    iput-object v0, p0, Lu/X;->c:Lr/C;

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lu/X;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lu/X;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lu/X;->a:I

    return v0
.end method

.method public final c()Lr/C;
    .locals 1

    iget-object v0, p0, Lu/X;->c:Lr/C;

    return-object v0
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, Lu/X;->a:I

    return-void
.end method

.method public final e(Lu/V;Lu/F;)Lu/V;
    .locals 0

    invoke-virtual {p1, p2}, Lu/V;->c(Lu/F;)V

    return-object p1
.end method
