.class public final LK9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK9/b$a;,
        LK9/b$b;
    }
.end annotation


# static fields
.field public static final c:LK9/b$a;


# instance fields
.field private final a:LH9/z;

.field private final b:LH9/B;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LK9/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LK9/b$a;-><init>(Ly7/k;)V

    sput-object v0, LK9/b;->c:LK9/b$a;

    return-void
.end method

.method public constructor <init>(LH9/z;LH9/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK9/b;->a:LH9/z;

    iput-object p2, p0, LK9/b;->b:LH9/B;

    return-void
.end method


# virtual methods
.method public final a()LH9/B;
    .locals 1

    iget-object v0, p0, LK9/b;->b:LH9/B;

    return-object v0
.end method

.method public final b()LH9/z;
    .locals 1

    iget-object v0, p0, LK9/b;->a:LH9/z;

    return-object v0
.end method
