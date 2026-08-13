.class final Lr0/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr0/P;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/P;

    invoke-direct {v0}, Lr0/P;-><init>()V

    sput-object v0, Lr0/P;->a:Lr0/P;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/RenderNode;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/RenderNode;->destroyDisplayListData()V

    return-void
.end method
