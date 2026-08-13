.class final Li9/A$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Li9/A$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li9/A$b;

    invoke-direct {v0}, Li9/A$b;-><init>()V

    sput-object v0, Li9/A$b;->D:Li9/A$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Li9/n;
    .locals 2

    sget-object v0, Li9/z;->b:Li9/z$b;

    sget-object v1, Li9/A$b$a;->D:Li9/A$b$a;

    invoke-virtual {v0, v1}, Li9/z$b;->a(Lx7/l;)Li9/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li9/A$b;->a()Li9/n;

    move-result-object v0

    return-object v0
.end method
