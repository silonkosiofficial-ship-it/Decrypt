.class public abstract Lu/V;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lu/F;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lu/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/V;->a:Ljava/lang/Object;

    iput-object p2, p0, Lu/V;->b:Lu/F;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lu/F;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lu/V;-><init>(Ljava/lang/Object;Lu/F;)V

    return-void
.end method


# virtual methods
.method public final a()Lu/F;
    .locals 1

    iget-object v0, p0, Lu/V;->b:Lu/F;

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu/V;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final c(Lu/F;)V
    .locals 0

    iput-object p1, p0, Lu/V;->b:Lu/F;

    return-void
.end method
