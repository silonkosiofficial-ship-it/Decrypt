.class LI7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field private final C:Lx7/p;


# direct methods
.method public constructor <init>(Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/m;->C:Lx7/p;

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LI7/m;->C:Lx7/p;

    invoke-static {v0, p1, p2}, LI7/n;->h(Lx7/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
