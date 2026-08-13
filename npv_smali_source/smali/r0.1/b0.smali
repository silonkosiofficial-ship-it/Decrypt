.class final Lr0/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr0/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr0/b0;

    invoke-direct {v0}, Lr0/b0;-><init>()V

    sput-object v0, Lr0/b0;->a:Lr0/b0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lo0/Z1;)V
    .locals 0

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lr0/a0;->a(Landroid/view/View;Landroid/graphics/RenderEffect;)V

    return-void
.end method
