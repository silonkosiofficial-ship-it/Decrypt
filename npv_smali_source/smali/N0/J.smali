.class public final LN0/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN0/J;

.field private static final b:Landroid/text/Layout$Alignment;

.field private static final c:Landroid/text/TextDirectionHeuristic;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN0/J;

    invoke-direct {v0}, LN0/J;-><init>()V

    sput-object v0, LN0/J;->a:LN0/J;

    sget-object v0, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    sput-object v0, LN0/J;->b:Landroid/text/Layout$Alignment;

    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    sput-object v0, LN0/J;->c:Landroid/text/TextDirectionHeuristic;

    const/16 v0, 0x8

    sput v0, LN0/J;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/text/Layout$Alignment;
    .locals 1

    sget-object v0, LN0/J;->b:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public final b()Landroid/text/TextDirectionHeuristic;
    .locals 1

    sget-object v0, LN0/J;->c:Landroid/text/TextDirectionHeuristic;

    return-object v0
.end method
