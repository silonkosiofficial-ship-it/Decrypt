.class public final Lr0/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr0/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/N;

    invoke-direct {v0}, Lr0/N;-><init>()V

    sput-object v0, Lr0/N;->a:Lr0/N;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Outline;Lo0/Q1;)V
    .locals 1

    .prologue
    instance-of v0, p2, Lo0/V;

    if-eqz v0, :cond_0

    check-cast p2, Lo0/V;

    invoke-virtual {p2}, Lo0/V;->s()Landroid/graphics/Path;

    move-result-object p2

    invoke-static {p1, p2}, Lr0/M;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
