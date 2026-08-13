.class final Lg8/j$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/j;->b(LO7/K;Lg8/t;)Ly8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lg8/j$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/j$b;

    invoke-direct {v0}, Lg8/j$b;-><init>()V

    sput-object v0, Lg8/j$b;->D:Lg8/j$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg8/j$b;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
