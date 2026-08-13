.class final LN/B$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LN/B$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/B$a;

    invoke-direct {v0}, LN/B$a;-><init>()V

    sput-object v0, LN/B$a;->D:LN/B$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN/A;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/B$a;->a()LN/A;

    const/4 v0, 0x0

    return-object v0
.end method
