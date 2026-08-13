.class public abstract Lh2/L$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/L$a$a;,
        Lh2/L$a$b;,
        Lh2/L$a$c;,
        Lh2/L$a$d;
    }
.end annotation


# static fields
.field public static final c:Lh2/L$a$b;


# instance fields
.field private final a:I

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh2/L$a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh2/L$a$b;-><init>(Ly7/k;)V

    sput-object v0, Lh2/L$a;->c:Lh2/L$a$b;

    return-void
.end method

.method private constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh2/L$a;->a:I

    iput-boolean p2, p0, Lh2/L$a;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(IZLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lh2/L$a;-><init>(IZ)V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lh2/L$a;->a:I

    return v0
.end method
